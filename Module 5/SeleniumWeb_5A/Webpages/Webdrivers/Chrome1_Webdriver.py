from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service
import time

#driver = webdriver.Chrome(ChromeDriverManager().install())
driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
driver.get("https://www.facebook.com/")
email = "abimpemom@yahoo.com"
password = 'topebimpebisi'
email_input=driver.find_element(By.XPATH, "//input[@id='email']")
email_input.send_keys(email)
password_input=driver.find_element(By.XPATH, '//*[@id="pass"]')
password_input.send_keys(password)
login=driver.find_element(By.NAME,"login" ) 
print(login.text)
time.sleep(3)
login.click()
time.sleep (30)
driver.close()
#login = driver.find_element(By.XPATH, "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button").click()