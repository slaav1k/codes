alphabet = {
    'А': 'A', 'Б': 'B', 'В': 'V', 'Г': 'G', 'Д': 'D', 'Е': 'E', 'Ё': 'E',
    'Ж': 'ZH', 'З': 'Z', 'И': 'I', 'Й': 'I', 'К': 'K', 'Л': 'L', 'М': 'M',
    'Н': 'N', 'О': 'O', 'П': 'P', 'Р': 'R', 'С': 'S', 'Т': 'T', 'У': 'U',
    'Ф': 'F', 'Х': 'KH', 'Ц': 'TC', 'Ч': 'CH', 'Ш': 'SH', 'Щ': 'SHCH',
    'Ы': 'Y', 'Э': 'E', 'Ю': 'IU', 'Я': 'IA', 'Ь': '', 'Ъ': ''
}

data, encoded_data = '', ''

with open("cyrillic.txt", encoding="UTF-8") as file_in:
    for string in file_in:
        data += string

for char in data:
    if char.upper() in alphabet:
        encoded_data += alphabet[char.upper()].lower().capitalize() if char == char.upper() else alphabet[char.upper()].lower()
    else:
        encoded_data += char

with open("transliteration.txt", "w", encoding="UTF-8") as file_out:
    print(encoded_data, file=file_out)