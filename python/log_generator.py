import time

while True:
    with open("../JAVA/network_logs.txt", "a") as file:
        file.write("[INFO] Network Active\n")

    print("Log Added")
    time.sleep(5)