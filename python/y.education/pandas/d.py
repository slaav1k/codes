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


def discount(cheque_df):
    df = cheque_df.copy()
    df.loc[df['number'] > 2, 'cost'] = df.loc[df['number'] > 2, 'cost'] * 0.5
    return df