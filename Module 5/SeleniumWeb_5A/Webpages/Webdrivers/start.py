from selenium import webdriver
from selenium.webdriver .chrome.service import   Service
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.by import By
import  time
def main():
    driver  = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
    driver.get("http://www.google.com")
    time.sleep(2)
    driver.close()

if __name__ == '_main_':
   main()
