package top.huang.computerstore.config;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 支付宝沙箱支付配置类
 * @date 2022/7/25 1:29
 */
@Data
@Component
public class AlipayConfig {
    //自己的appId
    public static String appId = "2021000122684784";
    //应用私有秘钥
    public static String appPrivateKey = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCtdSidEZSOVdMx5bCPnjeFlhYRhaTuaj/nQrU4Rg8NwGRRJBqahVjIb81xACyuBLqPxrr3r/0ZTYPIEt1/LWQ60rnLsRy1yE6E4xo46kTRhwer6EgiGYl3UYzfnja1Xt5RJNjYItR53SOnUQcKeCd27LIoDAKa1UMjkjXzvznLF86SYONRmHuu05YIg0mH0dtAC1aCH0Dk67QKoY9aRYTLMKBKhIj/1Gjfb7bCBAot/6mKnVL7xCC6+JOPaIfZNXMm9URhEnPTkYl4Ndqy5SRkkiPxF1WyL/lfW0TgRxcgb2eB2hzwYWSRzUGt6+T/8oX6Q7WSC+q+asrsJYDu3mCFAgMBAAECggEBAJm+Bklxk6K1H4RSebRSIBQfe1/8fLt1IT7xOX6vWhhuNnxU69+Z4Z+GuSk3ZmK3fkSBeKahLkyHEA796aUXrocUz+ljCnd1G2Ndh5h6zJSKgpo0P/s5d0Zy2dI6gXMwqwxxBGJOPNXm0/sxLnRxG0mlciNcwdJKxD97EKcDD06aR06kyy41LL8X3d4v0UH6r+TMXaOLQd3zfJiVtADUNW5Krzl/1RRiWu1kP9hMgN6iLx30U1gRh5XwIbCvtA1/aKlmxT4NeBZ1s8FnoaaTya7/4gTPI0L2l7/rQVDg7EjmvMsncZbws1Df7cPHAJ8erhtzuySV7x81If/ahaC3zAECgYEA/cjUGjZTVWqF3kI8MGFumPX1EuJNZWBtENXalOHVxHIqm7DpEwzf6fZfS6jPzV5YoPkm2WBgWkiwDDMnPOXGstHf58FkUQVgGLV7gS8vAHPJeNpMPlCIvRnXAWwOKo0xDnnCDP1tQw3riH+1ENW8F8c4IzZCBcTYfJ7Wuv3I5iUCgYEArvjPse32p5r616fBaB4MuvnS16IJeA16rXKtm8bq1zfqtHFZHRVMN8Ng0O953VtlrVuuUO+85/FZqkvavrYkFdymBtKURAAFUwsGWZfIrzFeFRXxKx20g+uHJiwuyFu8ZrPz1SXRtdVzqE+48UKUA63WMvO9reGK95VaUDRvkuECgYB0b1OAwzPwmHLayiC7QbhwTUgnZdSEknz3oGYssIBXJNoPnFcS+nEw8mw+VjEg1AxtrmH4kZMjWP4MWtvBwNos6MWFmuDfm0u/imQjnPY/iuAApoccf+58dAKFEIJfW3AKaCpzs0IR5a0ObykvlCA7+Jb08MvRwcJhSq7SE+W8UQKBgQCL6W+DMuqaCWZtzbns/KJnXN9JCEwUEIs5aMsEFqKw6Aiosz5z8BTbPkMLr4K+C5iZcAdKtvlSav6tGyzWdSUTyjWEnRxr56xaRCWWvLV/ybUWnU4UkRNIrayLTKc4FYrogRsIJM61XPK38s/LM9bRvk7avWa+ROzvnyDxo4xYYQKBgEkONMwkHkhm9pVgRtmQZBM4cSiDSav4Nxb4YBp9T/yXyvjNXQiB12nNNsPa7tCEw4mrk6eXKToLFhgHtWGlLVbY0qeXZbWZNfj3b+fVNliAIfj0wK2fIDG7LLhinpSWeiJfl5ye6Oy8qSwr1j6CnecHmkGuEGZ4N9b0AFvYRuQo";
    //支付宝公钥
    public static String alipayPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArXUonRGUjlXTMeWwj543hZYWEYWk7mo/50K1OEYPDcBkUSQamoVYyG/NcQAsrgS6j8a696/9GU2DyBLdfy1kOtK5y7EctchOhOMaOOpE0YcHq+hIIhmJd1GM3542tV7eUSTY2CLUed0jp1EHCngnduyyKAwCmtVDI5I18785yxfOkmDjUZh7rtOWCINJh9HbQAtWgh9A5Ou0CqGPWkWEyzCgSoSI/9Ro32+2wgQKLf+pip1S+8QguviTj2iH2TVzJvVEYRJz05GJeDXasuUkZJIj8RdVsi/5X1tE4EcXIG9ngdoc8GFkkc1Brevk//KF+kO1kgvqvmrK7CWA7t5ghQIDAQAB";
    //异步回调地址
    public static String notifyUrl = "http://localhost:8080/alipay/notifyNotice";
    //同步回调地址
    public static String returnUrl = "http://localhost:8080/alipay/returnNotice";
    //推荐使用这个秘钥
    public static String signType = "RSA2";
    //使用的编码格式
    public static String charset = "utf-8";
    //支付宝默认网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

}
