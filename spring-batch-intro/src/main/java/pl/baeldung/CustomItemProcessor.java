package pl.baeldung;

import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Transaction, Transaction> {

    public Transaction process(Transaction item) {
        return item;
    }
}
