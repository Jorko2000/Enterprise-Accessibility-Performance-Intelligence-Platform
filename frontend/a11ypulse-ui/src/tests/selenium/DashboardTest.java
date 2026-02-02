public class DashboardTest {

  WebDriver driver = new ChromeDriver();

  @Test
  void loadsDashboard() {
    driver.get("http://localhost:3000");
    assertTrue(driver.findElement(By.tagName("input")).isDisplayed());
    driver.quit();
  }
}
