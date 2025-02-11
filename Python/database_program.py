import sqlite3

db_name = "record.db"

def connect_to_db():
    db_conn = sqlite3.connect(db_name)
    db_cursor = db_conn.cursor()
    print("connected to db")
    return db_conn, db_cursor

def create_table(db_cursor):
    sql = "create table record (record_id integer, name text, artist text, price real, year integer, record_label text)"
    db_cursor.execute(sql)
    print("Created Table")

def drop_table(db_cursor):
    sql = "drop table if exists record"
    db_cursor.execute(sql)
    print("Table dropped")

def insert_row(db_cursor):
    sql = "insert into record values (?, ?, ?, ?, ?, ?)"
    record_id = int(input("Enter the record ID (int): "))
    name = input("Enter the name of the record (string): ")
    artist = input("Enter the artist of the record (string): ")
    price = float(input("Enter the price (float): "))
    year = int(input("Enter the year the record was released (int): "))
    record_label = input("Enter the record label that released this album (string): ")
    touple_of_values = (record_id, name, artist, price, year, record_label)
    db_cursor.execute(sql,touple_of_values)
    print("Inserted row into table")


def select_all(db_cursor):
    #without where clause
    sql = "select * from record"
    result_set = db_cursor.execute(sql)
    print("\nthese are the following rows: ")
    for row in result_set:
        print(row)
    print()

def select_row(db_cursor):
    #with where clause
    sql ="select * from record where record_id = ?"
    record_id = int(input("Please enter the record ID that you want to search for (int)"))
    touple_of_value = (record_id, )
    result_set = db_cursor.execute(sql, touple_of_value)
    print("\nHere are the rows you have selected: ")
    for row in result_set:
        print(row)
    print()

def update_row(db_cursor):
    sql = "update record set record_label = ?, price = ? where record_id = ?"
    record_id = int(input("enter the record ID of the record that you want to update (int): "))
    record_label = input("enter the record label of the record that you want to update (string)")
    price = float(input("enter the price that you want this record to be updated to (float):"))
    touple_of_values = (record_label, price, record_id)
    db_cursor.execute(sql, touple_of_values)
    print("Row updated")


def delete_row(db_cursor):
    sql ="delete from record where record_id = ?"
    record_id = int(input("enter the record ID that you want to delete(int): "))
    touple_of_value = (record_id, )
    db_cursor.execute(sql, touple_of_value)
    print("row deleted")

def display_menu(db_conn, db_cursor):
    while True:
        print("Menu:")
        print("Enter S to get started and create a new database")
        print("Enter C to create a new row")
        print("Enter R to retrieve data")
        print("Enter U to update a row")
        print("Enter D to delete a row")
        print("Enter Q to quit the program")
        choice = input("Enter your choice: ").upper()
        if choice == "S":
            drop_table(db_cursor)
            create_table(db_cursor)
        elif choice == "C":
            insert_row(db_cursor)
        elif choice == "U":
            update_row(db_cursor)
        elif choice == "R":
            select_row(db_cursor)
        elif choice == "D":
            delete_row(db_cursor)
        elif choice == "Q":
            print("Goodbye")
            break
        else:
            print("invalid choice of", choice)
        db_conn.commit()
        select_all(db_cursor)




def main():
    db_conn, db_cursor = connect_to_db()
    display_menu(db_conn, db_cursor)
    db_conn.close()

main()