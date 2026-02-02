export const useAuditQuery = (url: string) =>
  useQuery({
    queryKey: ["audit", url],
    queryFn: async () => (await api.post(`/audits?url=${url}`)).data,
    enabled: !!url,
  });
