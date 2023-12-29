from selenium import webdriver
from webdriver_manager.microsoft import EdgeChromiumDriverManager
from selenium.webdriver.common.by import By
from selenium.webdriver.edge.service import Service
import time

driver = webdriver.Edge(EdgeChromiumDriverManager().install())
def send_keys_to_check_weather(element, *keys):
    element.send_keys(keys)

def main():
 driver = webdriver.Edge(EdgeChromiumDriverManager().install())
 driver.get("https://weather.com")

#current temprature
current_temperature = driver.find_element(By.XPATH, '//*[@id="WxuTodayWeatherCard-main-486ce56c-74e0-4152-bd76-7aea8e98520a"]/section/div/ul/li[1]/a/div[1]/span')
print("current temperature:", current_temperature.text)

morning_temperature = driver.find_element(By.XPATH, '//*[@id="WxuTodayWeatherCard-main-486ce56c-74e0-4152-bd76-7aea8e98520a"]/section/div/ul/li[3]/a/div[1]/span')
print("morning temperature:", morning_temperature.text)

afternoon_temperature = driver.find_element(By.XPATH, '//*[@id="WxuTodayWeatherCard-main-486ce56c-74e0-4152-bd76-7aea8e98520a"]/section/div/ul/li[2]/a/div[1]/span')
print("afternoon temperature:", afternoon_temperature.text)
 #Evening Temperature
evening_temperature = driver.find_element(By.XPATH, '//*[@id="WxuTodayWeatherCard-main-486ce56c-74e0-4152-bd76-7aea8e98520a"]/section/div/ul/li[3]/a/div[1]/span')
print("evening temperature:", evening_temperature.text)

overnight_temperature = driver.find_element(By.XPATH, '//*[@id="WxuTodayWeatherCard-main-486ce56c-74e0-4152-bd76-7aea8e98520a"]/section/div/ul/li[3]/a/div[1]/span')
print("overnight temperature:", evening_temperature.text)

time.sleep(30)

if __name__ == '__main__':
    main()