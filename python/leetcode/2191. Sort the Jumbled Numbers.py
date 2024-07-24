def sortJumbled(mapping, nums):
    def get_mapped_value(num):
        mapped_num_str = ''.join(
            str(mapping[int(digit)]) for digit in str(num))
        return int(mapped_num_str)
    mapped_values = [(num, get_mapped_value(num)) for num in nums]
    mapped_values.sort(key=lambda x: x[1])
    return [num for num, _ in mapped_values]
