class Queue():
    def __init__(self) -> None:
        self.ls = []

    def push(self, el):
        self.ls.append(el)

    def pop(self):
        if not self.is_empty():
            return self.ls.pop(0)

    def is_empty(self):
        return self.ls == 0
    
queue = Queue()
for item in range(10):
    queue.push(item)
while not queue.is_empty():
    print(queue.pop(), end=" ")