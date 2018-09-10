package no.sparebank1.sb1fs.transactions;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class Transaction {
    private Amount amount;
    private String accountingDate;
    private String description;
    private String archiveReference;
    private TransactionLinks links;
    private String remoteAccount;
    private String transactionCode;
    private String transactionType;

    @JsonProperty("amount")
    public Amount getAmount() { return amount; }
    @JsonProperty("amount")
    public void setAmount(Amount value) { this.amount = value; }

    @JsonProperty("accountingDate")
    public String getAccountingDate() { return accountingDate; }
    @JsonProperty("accountingDate")
    public void setAccountingDate(String value) { this.accountingDate = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("archiveReference")
    public String getArchiveReference() { return archiveReference; }
    @JsonProperty("archiveReference")
    public void setArchiveReference(String value) { this.archiveReference = value; }

    @JsonProperty("_links")
    public TransactionLinks getLinks() { return links; }
    @JsonProperty("_links")
    public void setLinks(TransactionLinks value) { this.links = value; }

    @JsonProperty("remoteAccount")
    public String getRemoteAccount() { return remoteAccount; }
    @JsonProperty("remoteAccount")
    public void setRemoteAccount(String value) { this.remoteAccount = value; }

    @JsonProperty("transactionCode")
    public String getTransactionCode() { return transactionCode; }
    @JsonProperty("transactionCode")
    public void setTransactionCode(String value) { this.transactionCode = value; }

    @JsonProperty("transactionType")
    public String getTransactionType() { return transactionType; }
    @JsonProperty("transactionType")
    public void setTransactionType(String value) { this.transactionType = value; }
}
