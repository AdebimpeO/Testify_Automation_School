from selenium import webdriver

driver = webdriver.Chrome()
driver.get("http://10.1.88.26:8081/agentportal/agentportal/Application.html#SUBSCRIBERS/2")
print ("driver.title")
print ("driver.current_url")
driver.quit()