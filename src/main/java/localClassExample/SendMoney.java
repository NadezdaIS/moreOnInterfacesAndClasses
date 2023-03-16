package localClassExample;

public class SendMoney {

    public void sendByCard(Double amount, Long cardNumber, Integer cvc, String expiryDate){

        class SwedBankData {
            Double amount;
            Long cardNumber;
            Integer cvc;
            String expiryDate;
            String secretKey;

            public SwedBankData() {
            }
        }

        SwedBankData transactionData = new SwedBankData();
        transactionData.amount = amount;
        transactionData.cardNumber = cardNumber;
        transactionData.cvc = cvc;
        transactionData.expiryDate = expiryDate;
        transactionData.secretKey = "jdf#@434#DJDJS";

        // for example we can send this data
        // SwedBankResponse swedBankResponse = swedbankLibrary.processTransaction(transactionData);
    }
}

