import pandas as pd


def cheque(price_list, **purchases):
    data = []
    

    for product, number in purchases.items():
        price = price_list[product]
        cost = price * number
        data.append([product, price, number, cost])
    

    df = pd.DataFrame(data, columns=['product', 'price', 'number', 'cost'])
    df = df.sort_values(by='product').reset_index(drop=True)
    return df

# Пример использования функции
products = ['bread', 'milk', 'soda', 'cream']
prices = [37, 58, 99, 72]
price_list = pd.Series(prices, index=products)
result = cheque(price_list, soda=3, milk=2, cream=1)
print(result)
