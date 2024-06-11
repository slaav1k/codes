from collections import deque, defaultdict

def parse_dependencies(input_lines):
    dependencies = {}
    for line in input_lines:
        if "->" in line:
            parts = line.split("->")
            package_from = parts[0].strip().strip('"')
            package_to = parts[1].split("[")[0].strip().strip('"')
            if package_from not in dependencies:
                dependencies[package_from] = []
            dependencies[package_from].append(package_to)
            if package_to not in dependencies:
                dependencies[package_to] = []
    return dependencies

def topological_sort(dependencies):
    in_degree = defaultdict(int)
    for node in dependencies:
        in_degree[node] = 0
    for node in dependencies:
        for neighbour in dependencies[node]:
            in_degree[neighbour] += 1

    queue = deque([node for node in in_degree if in_degree[node] == 0])
    topo_order = []

    while queue:
        node = queue.popleft()
        topo_order.append(node)
        for neighbour in dependencies[node]:
            in_degree[neighbour] -= 1
            if in_degree[neighbour] == 0:
                queue.append(neighbour)

    return topo_order

def main():
    with open("python/отбор SRE week/input.txt", "r") as file:
        input_lines = file.readlines()
    
    dependencies = parse_dependencies(input_lines)
    installation_order = topological_sort(dependencies)[::-1]
    for package in installation_order:
        print(package)

if __name__ == "__main__":
    main()
