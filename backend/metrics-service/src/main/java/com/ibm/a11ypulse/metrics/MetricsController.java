@RestController
@RequestMapping("/api/metrics")
public class MetricsController {

  @GetMapping
  public List<Integer> metrics() {
    return List.of(80, 85, 90, 95);
  }
}
