.class Lcn/sharesdk/facebook/f$2;
.super Lcn/sharesdk/framework/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/facebook/f;->a()Lcn/sharesdk/framework/authorize/RegisterView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/facebook/f;


# direct methods
.method constructor <init>(Lcn/sharesdk/facebook/f;)V
    .locals 0

    iput-object p1, p0, Lcn/sharesdk/facebook/f$2;->a:Lcn/sharesdk/facebook/f;

    invoke-direct {p0}, Lcn/sharesdk/framework/d;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    if-eqz p2, :cond_0

    const-string v0, "fbconnect://success"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcn/sharesdk/facebook/f$2;->a:Lcn/sharesdk/facebook/f;

    invoke-static {v0, p2}, Lcn/sharesdk/facebook/f;->a(Lcn/sharesdk/facebook/f;Ljava/lang/String;)V

    :cond_0
    invoke-super {p0, p1, p2}, Lcn/sharesdk/framework/d;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
