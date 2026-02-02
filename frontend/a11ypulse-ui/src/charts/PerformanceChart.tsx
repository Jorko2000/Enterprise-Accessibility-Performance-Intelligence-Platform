useEffect(() => {
  const svg = d3.select(ref.current);
  svg.selectAll("rect")
     .data(data)
     .enter()
     .append("rect")
     .attr("height", d => d);
}, [data]);
