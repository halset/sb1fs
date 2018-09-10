package no.sparebank1.sb1fs.transactions;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class APITransactions {
    private Transaction[] transactions;
    private APITransactionsLinks links;

    @JsonProperty("transactions")
    public Transaction[] getTransactions() { return transactions; }
    @JsonProperty("transactions")
    public void setTransactions(Transaction[] value) { this.transactions = value; }

    @JsonProperty("_links")
    public APITransactionsLinks getLinks() { return links; }
    @JsonProperty("_links")
    public void setLinks(APITransactionsLinks value) { this.links = value; }
}
