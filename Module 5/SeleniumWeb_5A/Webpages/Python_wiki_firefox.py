
from selenium import webdriver
from selenium.webdriver import Keys
from selenium.webdriver.common.by import By
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.firefox.service import Service
from selenium.webdriver.common.by import By
import time
def send_keys_to_google(element, *keys):
    element.send_keys(keys)
def main():
    driver = webdriver.Firefox(service=Service(GeckoDriverManager().install()))
    driver.get("https://www.google.com/")
    send_keys_to_google(driver.find_element(By.XPATH, '//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]'), "Python")
    search_box = driver.find_element(By.XPATH, "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]").click()
    print("login:", search_box)
    text_on_wikipedia = driver.find_element(By.XPATH, "//span[contains(text(),'Python is a high-level, general-purpose programmin')]")
    print("Wikipedia:", text_on_wikipedia.text)
    time.sleep(5)
if __name__ == '__main__':
    main()