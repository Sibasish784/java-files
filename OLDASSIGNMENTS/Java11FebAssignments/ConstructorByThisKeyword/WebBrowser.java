class WebBrowser
{
    int BrowserNo;
    String BrowserName;
    String BrowserVersion;

    WebBrowser(int BrowserNo, String BrowserName, String BrowserVersion)
    {
        this.BrowserNo = BrowserNo;
        this.BrowserName = BrowserName;
        this.BrowserVersion = BrowserVersion;
    }

    void display()
    {
        System.out.println("Browser No: " + BrowserNo);
        System.out.println("Browser Name: " + BrowserName);
        System.out.println("Browser Version: " + BrowserVersion);
    }

    public static void main(String[] args)
    {
        WebBrowser browser1 = new WebBrowser(1, "Google Chrome", "91.0.4472.124");
        WebBrowser browser2 = new WebBrowser(2, "Mozilla Firefox", "89.0.2");
        WebBrowser browser3 = new WebBrowser(3, "Microsoft Edge", "91.0.864.59");

        browser1.display();
        System.out.println();
        browser2.display();
        System.out.println();
        browser3.display();
    }
}