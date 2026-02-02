const Dashboard = () => {
  const [url, setUrl] = useState("");
  const { data } = useAuditQuery(url);

  return (
    <>
      <TextInput labelText="URL" onChange={e => setUrl(e.target.value)} />
      {data && <AuditCard audit={data} />}
    </>
  );
};
