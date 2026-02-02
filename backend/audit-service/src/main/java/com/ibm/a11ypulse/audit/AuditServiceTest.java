class AuditServiceTest {

  private final AuditService service = new AuditService();

  @Test
  void shouldReturnScores() {
    AuditResult result = service.runAudit("https://example.com");
    assertTrue(result.getAccessibilityScore() > 0);
  }
}
