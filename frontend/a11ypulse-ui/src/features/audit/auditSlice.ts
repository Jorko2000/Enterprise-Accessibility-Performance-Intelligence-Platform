const auditSlice = createSlice({
  name: "audit",
  initialState: { selectedUrl: "" },
  reducers: {
    setUrl(state, action) {
      state.selectedUrl = action.payload;
    },
  },
});
