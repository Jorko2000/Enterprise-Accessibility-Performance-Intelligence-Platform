const AuditCard = React.memo(({ audit }) => (
  <Tile>
    <p>Performance: {audit.performanceScore}</p>
    <p>Accessibility: {audit.accessibilityScore}</p>
  </Tile>
));
