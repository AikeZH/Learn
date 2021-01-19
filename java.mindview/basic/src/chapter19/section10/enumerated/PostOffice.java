package chapter19.section10.enumerated;

import util.Enums;

import java.util.Iterator;

/**
 * Modeling a post office
 *
 * @author zhanghua
 * @date 2021/1/19
 */
public class PostOffice {
    enum MailHandler {
        GENERAL_DELIVERY {
            @Override
            boolean handle(Mail mail) {
                switch (mail.generalDelivery) {
                    case YES:
                        System.out.println("Using general delivery for " + mail);
                        return true;
                    default:
                        return false;
                }
            }
        },
        MACHINE_SCAN {
            @Override
            boolean handle(Mail mail) {
                switch (mail.scannability) {
                    case UNSCANNABLE:
                        return false;
                    default:
                        switch (mail.address) {
                            case INCORRECT:
                                return false;
                            default:
                                System.out.println("Delivering " + mail + " automatically");
                                return true;
                        }
                }
            }
        },
        VISUAL_INSPECTION {
            @Override
            boolean handle(Mail mail) {
                switch (mail.readability) {
                    case ILLEGIBLE:
                        return false;
                    default:
                        System.out.println("Delivering " + mail + " normally");
                        return true;
                }
            }
        },
        RETURN_TO_SENDER {
            @Override
            boolean handle(Mail mail) {
                switch (mail.returnAddress) {
                    case MISSING:
                        return false;
                    default:
                        System.out.println("Returning " + mail + " to sender");
                        return true;
                }
            }
        };
        abstract boolean handle(Mail mail);
    }

    static void handle(Mail mail) {
        for (MailHandler item : MailHandler.values()) {
            if (item.handle(mail)){
                return;
            }
        }
        System.out.println(mail + " is a dead letter");
    }
    /* Output:
    Mail 0, General Delivery: NO2, Address Scannability: UNSCANNABLE, Address Readability: YES3, Address: OK1, Return Address: OK1
    Delivering Mail 0 normally
    *******************
    Mail 1, General Delivery: NO5, Address Scannability: YES3, Address Readability: ILLEGIBLE, Address: OK5, Return Address: OK1
    Delivering Mail 1 automatically
    *******************
    Mail 2, General Delivery: YES, Address Scannability: YES3, Address Readability: YES1, Address: OK1, Return Address: OK5
    Using general delivery for Mail 2
    *******************
    Mail 3, General Delivery: NO4, Address Scannability: YES3, Address Readability: YES1, Address: INCORRECT, Return Address: OK4
    Delivering Mail 3 normally
    *******************
    Mail 4, General Delivery: NO4, Address Scannability: UNSCANNABLE, Address Readability: YES1, Address: INCORRECT, Return Address: OK2
    Delivering Mail 4 normally
    *******************
    Mail 5, General Delivery: NO3, Address Scannability: YES1, Address Readability: ILLEGIBLE, Address: OK4, Return Address: OK2
    Delivering Mail 5 automatically
    *******************
    Mail 6, General Delivery: YES, Address Scannability: YES4, Address Readability: ILLEGIBLE, Address: OK4, Return Address: OK4
    Using general delivery for Mail 6
    *******************
    Mail 7, General Delivery: YES, Address Scannability: YES3, Address Readability: YES4, Address: OK2, Return Address: MISSING
    Using general delivery for Mail 7
    *******************
    Mail 8, General Delivery: NO3, Address Scannability: YES1, Address Readability: YES3, Address: INCORRECT, Return Address: MISSING
    Delivering Mail 8 normally
    *******************
    Mail 9, General Delivery: NO1, Address Scannability: UNSCANNABLE, Address Readability: YES2, Address: OK1, Return Address: OK4
    Delivering Mail 9 normally
    *******************
     */

    public static void main(String[] args) {
        for (Mail item : Mail.generator(10)) {
            System.out.println(item.details());
            handle(item);
            System.out.println("*******************");
        }
    }
}

class Mail {
    // The NO's lower the probability of random selection
    enum GeneralDelivery {
        YES, NO1, NO2, NO3, NO4, NO5
    }

    enum Scannability {
        UNSCANNABLE, YES1, YES2, YES3, YES4
    }

    enum Readability {
        ILLEGIBLE, YES1, YES2, YES3, YES4
    }

    enum Address {
        INCORRECT, OK1, OK2, OK3, OK4, OK5, OK6
    }

    enum ReturnAddress {
        MISSING, OK1, OK2, OK3, OK4, OK5
    }

    GeneralDelivery generalDelivery;
    Scannability scannability;
    Readability readability;
    Address address;
    ReturnAddress returnAddress;

    static long counter = 0;
    long id = counter++;

    @Override
    public String toString() {
        return "Mail " + id;
    }

    public String details() {
        return toString() +
                ", General Delivery: " + generalDelivery +
                ", Address Scannability: " + scannability +
                ", Address Readability: " + readability +
                ", Address: " + address +
                ", Return Address: " + returnAddress;
    }

    // Generate test Mail
    public static Mail randomMail() {
        Mail mail = new Mail();
        mail.generalDelivery = Enums.random(GeneralDelivery.class);
        mail.scannability = Enums.random(Scannability.class);
        mail.readability = Enums.random(Readability.class);
        mail.address = Enums.random(Address.class);
        mail.returnAddress = Enums.random(ReturnAddress.class);
        return mail;
    }

    public static Iterable<Mail> generator(final int count) {
        return new Iterable<Mail>() {
            int n = count;

            @Override
            public Iterator<Mail> iterator() {
                return new Iterator<Mail>() {
                    @Override
                    public boolean hasNext() {
                        return n-- > 0;
                    }

                    @Override
                    public Mail next() {
                        return randomMail();
                    }

                    @Override
                    public void remove() {
                        // Not implemented
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}