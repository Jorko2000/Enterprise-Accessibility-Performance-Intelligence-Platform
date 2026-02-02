@Entity
public class AuditResult {

  @Id
  @GeneratedValue
  private Long id;

  private String url;
  private int performanceScore;
  private int accessibilityScore;

  // getters/setters omitted for brevity
}
