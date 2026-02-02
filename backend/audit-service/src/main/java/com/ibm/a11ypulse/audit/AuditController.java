@RestController
@RequestMapping("/api/audits")
public class AuditController {

  private final AuditService service;

  public AuditController(AuditService service) {
    this.service = service;
  }

  @PostMapping
  public AuditResult audit(@RequestParam String url) {
    return service.runAudit(url);
  }
}
