import json
from os.path import exists
def read_json_file ():
    file_exists = exists("songs.json")
    if file_exists == False:
        print("file could not be found, we will create one for you")
        open("songs.json", "x")
    input_file_ptr = open("songs.json","r")
    outer_dictonary = json.load(input_file_ptr)
    list_of_songs = outer_dictonary.get("songlist")
    input_file_ptr.close()
    return list_of_songs

def allow_user_to_choose(list_of_all_songs):
    playlist = list()

    while True:
        print("here are your song options:\n")

        counter_variable = 1
        for song in list_of_all_songs:
            title = song.get("title")
            artist = song.get("artist")
            print(str(counter_variable)+"." , title, " by " ,artist)
            counter_variable += 1

        print("Choose a song number to add to your playlist\n")
        num_chosen = int(input("Enter the song number: "))

        song_dictonary_chosen = list_of_all_songs[num_chosen -1]
        song_id = song_dictonary_chosen.get("id")
        title = song_dictonary_chosen.get("title")
        artist = song_dictonary_chosen.get("artist")
        year = song_dictonary_chosen.get("year")
        album = song_dictonary_chosen.get("album")
        grammy_winner = song_dictonary_chosen.get("grammy-winner")

        inner_list = list()
        inner_list.append(song_id)
        inner_list.append(title)
        inner_list.append(artist)
        inner_list.append(year)
        inner_list.append(album)
        inner_list.append(grammy_winner)

        playlist.append(inner_list)

        choose_again = input("Do you want to choose again: Y or N?")
        if choose_again == "N" or choose_again == "n":
            break
    return playlist

def write_to_CSV_fil(two_d_structure_of_songs):
    output_file_ptr = open("playlist.csv","w")
    output_file_ptr.write("Number, Song Title, Artist, Year, Album, Grammy-Winner\n")

    for song_inner_list in two_d_structure_of_songs:
        song_id = str(song_inner_list[0])
        title = song_inner_list[1]
        artist = song_inner_list[2]
        year = str(song_inner_list[3])
        album = song_inner_list[4]
        grammy_winner = str(song_inner_list[5])

        output_file_ptr.write(song_id + "," + title + "," + artist + "," + year + "," + album + "," + grammy_winner + "\n")

    output_file_ptr.close()

def main():
    list_of_all_songs = read_json_file()
    two_d_structure_of_songs = allow_user_to_choose(list_of_all_songs)
    write_to_CSV_fil(two_d_structure_of_songs)


main()
