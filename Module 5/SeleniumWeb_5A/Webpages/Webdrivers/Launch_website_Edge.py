from selenium import webdriver

driver = webdriver.Edge()
driver.get("https://www.google.com")

print ("driver.title")
print ("driver.current_url")
