.class public Lcom/fimi/soul/module/social/WebViewActivity;
.super Landroid/app/Activity;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/social/WebViewActivity$InterfaceJS;,
        Lcom/fimi/soul/module/social/WebViewActivity$HelloWebViewClient;
    }
.end annotation


# static fields
.field private static final SCANNIN_GREQUEST_CODE:I = 0x1

.field public static final WEB_TITLE:Ljava/lang/String; = "title"

.field public static final WEB_URL:Ljava/lang/String; = "url"


# instance fields
.field private back_btn:Landroid/widget/ImageView;

.field private index:I

.field private mAbTitleBar:Lcom/fimi/soul/view/titlebar/FmTitleBar;

.field mWebView:Landroid/webkit/WebView;

.field private main_url:Ljava/lang/String;

.field private policy_url:Ljava/lang/String;

.field private right_bt:Landroid/widget/Button;

.field private temp_url:Ljava/lang/String;

.field private title:Landroid/widget/TextView;

.field private wholeJS:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const-string v0, "https://api.jr.mi.com/insurance/insurance_asset.html?source=p0&from=local#/index"

    iput-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->policy_url:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$002(Lcom/fimi/soul/module/social/WebViewActivity;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/social/WebViewActivity;->index:I

    return p1
.end method

.method static synthetic access$100(Lcom/fimi/soul/module/social/WebViewActivity;)Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->right_bt:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic access$200(Lcom/fimi/soul/module/social/WebViewActivity;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->policy_url:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$500(Lcom/fimi/soul/module/social/WebViewActivity;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->temp_url:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$502(Lcom/fimi/soul/module/social/WebViewActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/social/WebViewActivity;->temp_url:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$600(Lcom/fimi/soul/module/social/WebViewActivity;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->main_url:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$700(Lcom/fimi/soul/module/social/WebViewActivity;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->back_btn:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$800(Lcom/fimi/soul/module/social/WebViewActivity;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->wholeJS:Ljava/lang/String;

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    const/high16 v3, 0x4000000

    const/4 v1, 0x0

    const/4 v5, 0x1

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-lt v0, v2, :cond_0

    invoke-virtual {p0}, Lcom/fimi/soul/module/social/WebViewActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v3, v3}, Landroid/view/Window;->setFlags(II)V

    new-instance v0, Lcom/fimi/soul/module/social/SystemBarTintManager;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/social/SystemBarTintManager;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v5}, Lcom/fimi/soul/module/social/SystemBarTintManager;->setStatusBarTintEnabled(Z)V

    const v2, 0x7f0f00d4

    invoke-virtual {v0, v2}, Lcom/fimi/soul/module/social/SystemBarTintManager;->setStatusBarTintResource(I)V

    :cond_0
    const v0, 0x7f040102

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/social/WebViewActivity;->setContentView(I)V

    const v0, 0x7f1001b2

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/social/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->back_btn:Landroid/widget/ImageView;

    const v0, 0x7f1004f5

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/social/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->right_bt:Landroid/widget/Button;

    const v0, 0x7f10009c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/social/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->title:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/social/WebViewActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [Landroid/view/View;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/fimi/soul/module/social/WebViewActivity;->title:Landroid/widget/TextView;

    aput-object v4, v2, v3

    iget-object v3, p0, Lcom/fimi/soul/module/social/WebViewActivity;->right_bt:Landroid/widget/Button;

    aput-object v3, v2, v5

    invoke-static {v0, v2}, Lcom/fimi/soul/utils/au;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/social/WebViewActivity;->loadFiileJS()V

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->back_btn:Landroid/widget/ImageView;

    new-instance v2, Lcom/fimi/soul/module/social/WebViewActivity$1;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/social/WebViewActivity$1;-><init>(Lcom/fimi/soul/module/social/WebViewActivity;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->right_bt:Landroid/widget/Button;

    new-instance v2, Lcom/fimi/soul/module/social/WebViewActivity$2;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/social/WebViewActivity$2;-><init>(Lcom/fimi/soul/module/social/WebViewActivity;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f1000f0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/social/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const-string v2, "UTF-8"

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setDefaultTextEncodingName(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    new-instance v2, Lcom/fimi/soul/module/social/WebViewActivity$InterfaceJS;

    invoke-direct {v2, p0, v1}, Lcom/fimi/soul/module/social/WebViewActivity$InterfaceJS;-><init>(Lcom/fimi/soul/module/social/WebViewActivity;Lcom/fimi/soul/module/social/WebViewActivity$1;)V

    const-string v3, "interfacejs"

    invoke-virtual {v0, v2, v3}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    new-instance v2, Lcom/fimi/soul/module/social/WebViewActivity$HelloWebViewClient;

    invoke-direct {v2, p0, v1}, Lcom/fimi/soul/module/social/WebViewActivity$HelloWebViewClient;-><init>(Lcom/fimi/soul/module/social/WebViewActivity;Lcom/fimi/soul/module/social/WebViewActivity$1;)V

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/social/WebViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v0, "url"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/social/WebViewActivity;->setTitle(Ljava/lang/CharSequence;)V

    :goto_0
    if-eqz v0, :cond_1

    iput-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->main_url:Ljava/lang/String;

    iget-object v1, p0, Lcom/fimi/soul/module/social/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :goto_1
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/fimi/soul/module/social/WebViewActivity;->finish()V

    goto :goto_1

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method public onGoBack()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->temp_url:Ljava/lang/String;

    iget-object v1, p0, Lcom/fimi/soul/module/social/WebViewActivity;->main_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/fimi/soul/module/social/WebViewActivity;->finish()V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->right_bt:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/fimi/soul/module/social/WebViewActivity;->main_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/fimi/soul/module/social/WebViewActivity;->finish()V

    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    const/4 v0, 0x4

    if-ne p1, v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->temp_url:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/fimi/soul/module/social/WebViewActivity;->finish()V

    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->temp_url:Ljava/lang/String;

    iget-object v1, p0, Lcom/fimi/soul/module/social/WebViewActivity;->main_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/fimi/soul/module/social/WebViewActivity;->finish()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->copyBackForwardList()Landroid/webkit/WebBackForwardList;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/module/social/WebViewActivity;->index:I

    invoke-virtual {v0}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v1, v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->right_bt:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/social/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    goto :goto_0

    :cond_3
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_1
.end method
