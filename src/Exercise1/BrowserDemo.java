/**
 * Name:        İlke Deniz Karakaş
 * Student ID:  240444405
 * Date:        24.11.2026
 */
package Exercise1;

public class BrowserDemo {
    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory();

        // STEP 1: Visit three webpages.
        browser.visit("google.com");
        browser.visit("youtube.com");
        browser.goBack();

        browser.visit("Facebook.com");
        browser.goBack();

        // STEP 3: Go forward once.
        browser.goForward();

        // STEP 4: Visit a new webpage.
        browser.visit("stackoverflow.com");

        // STEP 5: Display the current webpage.
        browser.displayCurrentPage();

        // STEP 6: Display the complete browser history.
        browser.displayHistory();
    }
}
