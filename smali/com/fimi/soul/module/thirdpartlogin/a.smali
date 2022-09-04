.class public Lcom/fimi/soul/module/thirdpartlogin/a;
.super Lcn/sharesdk/framework/authorize/AuthorizeAdapter;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 0

    invoke-super {p0}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->onCreate()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/thirdpartlogin/a;->hideShareSDKLogo()V

    return-void
.end method
