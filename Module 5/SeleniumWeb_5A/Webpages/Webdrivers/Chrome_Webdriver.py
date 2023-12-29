from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service
import time


def send_keys_to_facebook(element, *keys):
    element.send_keys(keys)
def main():
    driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
    driver.get("https://www.facebook.com/")

    send_keys_to_facebook(driver.find_element(By.ID, "email"), "abimpemom@yahoo.com")
    send_keys_to_facebook(driver.find_element(By.XPATH, '//*[@id="pass"]'), "topebimpebisi")
    login = driver.find_element(By.NAME, "login").click()
    print("login:", login)
    time.sleep(20)


if __name__ == '__main__':
    main()


