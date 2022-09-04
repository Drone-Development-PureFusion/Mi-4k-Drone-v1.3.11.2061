.class public Lcom/fimi/soul/module/setting/ShowTextActivity;
.super Lcom/fimi/soul/base/BaseActivity;


# static fields
.field public static final a:Ljava/lang/String; = "URL_TITLE"

.field public static final b:Ljava/lang/String; = "URL_LOCAL"

.field public static final c:Ljava/lang/String; = "URL_ONLINE"


# instance fields
.field private d:Landroid/webkit/WebView;

.field private e:Landroid/widget/Button;

.field private f:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/base/BaseActivity;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 5

    const/4 v4, 0x1

    const-string v0, "URL_ONLINE"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v0, "URL_LOCAL"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "URL_TITLE"

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v3, p0, Lcom/fimi/soul/module/setting/ShowTextActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const v0, 0x7f10019c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/ShowTextActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/ShowTextActivity;->e:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/ShowTextActivity;->e:Landroid/widget/Button;

    new-instance v3, Lcom/fimi/soul/module/setting/ShowTextActivity$1;

    invoke-direct {v3, p0}, Lcom/fimi/soul/module/setting/ShowTextActivity$1;-><init>(Lcom/fimi/soul/module/setting/ShowTextActivity;)V

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f1000f0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/ShowTextActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/ShowTextActivity;->d:Landroid/webkit/WebView;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/ShowTextActivity;->d:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/ShowTextActivity;->d:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/ShowTextActivity;->d:Landroid/webkit/WebView;

    new-instance v3, Lcom/fimi/soul/module/setting/ShowTextActivity$2;

    invoke-direct {v3, p0}, Lcom/fimi/soul/module/setting/ShowTextActivity$2;-><init>(Lcom/fimi/soul/module/setting/ShowTextActivity;)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    invoke-static {p0}, Lcom/fimi/soul/utils/au;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/ShowTextActivity;->d:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/ShowTextActivity;->d:Landroid/webkit/WebView;

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/fimi/soul/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f040040

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/ShowTextActivity;->setContentView(I)V

    const v0, 0x7f10009c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/ShowTextActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/ShowTextActivity;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/ShowTextActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/setting/ShowTextActivity;->a(Landroid/content/Intent;)V

    return-void
.end method
