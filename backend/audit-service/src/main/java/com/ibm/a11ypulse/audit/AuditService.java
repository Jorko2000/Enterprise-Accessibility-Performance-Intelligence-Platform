@Service
public class AuditService {

  public AuditResult runAudit(String url) {
    return new AuditResult(url, 90, 95);
  }
}
