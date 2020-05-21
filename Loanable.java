public interface Loanable {
    boolean isLoanable();

    default int getLateFee() {
        return 15;
    }
}