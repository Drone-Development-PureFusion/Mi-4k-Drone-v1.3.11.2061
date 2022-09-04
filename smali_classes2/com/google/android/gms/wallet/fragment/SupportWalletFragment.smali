.class public final Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;
.super Landroid/support/v4/app/Fragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$a;,
        Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;,
        Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;,
        Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;

.field private b:Z

.field private final c:Lcom/google/android/gms/c/i;

.field private final d:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;

.field private e:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;

.field private final f:Landroid/support/v4/app/Fragment;

.field private g:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

.field private h:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

.field private i:Lcom/google/android/gms/wallet/MaskedWalletRequest;

.field private j:Lcom/google/android/gms/wallet/MaskedWallet;

.field private k:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->b:Z

    invoke-static {p0}, Lcom/google/android/gms/c/i;->a(Landroid/support/v4/app/Fragment;)Lcom/google/android/gms/c/i;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->c:Lcom/google/android/gms/c/i;

    new-instance v0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;-><init>(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$1;)V

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->d:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;

    new-instance v0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;-><init>(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;)V

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->e:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;

    iput-object p0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->f:Landroid/support/v4/app/Fragment;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;)Landroid/support/v4/app/Fragment;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->f:Landroid/support/v4/app/Fragment;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;Lcom/google/android/gms/wallet/MaskedWallet;)Lcom/google/android/gms/wallet/MaskedWallet;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->j:Lcom/google/android/gms/wallet/MaskedWallet;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;Lcom/google/android/gms/wallet/MaskedWalletRequest;)Lcom/google/android/gms/wallet/MaskedWalletRequest;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->i:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;)Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;

    return-object p1
.end method

.method public static a(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;)Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;
    .locals 3

    new-instance v0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "extraWalletFragmentOptions"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v2, v0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->f:Landroid/support/v4/app/Fragment;

    invoke-virtual {v2, v1}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->h:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->g:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->k:Ljava/lang/Boolean;

    return-object p1
.end method

.method static synthetic b(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;)Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->b:Z

    return v0
.end method

.method static synthetic d(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;)Lcom/google/android/gms/c/i;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->c:Lcom/google/android/gms/c/i;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->g:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;)Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->e:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->h:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    return-object v0
.end method

.method static synthetic h(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;)Lcom/google/android/gms/wallet/MaskedWalletRequest;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->i:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    return-object v0
.end method

.method static synthetic i(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;)Lcom/google/android/gms/wallet/MaskedWallet;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->j:Lcom/google/android/gms/wallet/MaskedWallet;

    return-object v0
.end method

.method static synthetic j(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->k:Ljava/lang/Boolean;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;

    invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;->a(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/wallet/MaskedWallet;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;

    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;->a(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;Lcom/google/android/gms/wallet/MaskedWallet;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->j:Lcom/google/android/gms/wallet/MaskedWallet;

    :goto_0
    return-void

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->j:Lcom/google/android/gms/wallet/MaskedWallet;

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/wallet/MaskedWalletRequest;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;

    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;->a(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;Lcom/google/android/gms/wallet/MaskedWalletRequest;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->i:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    :goto_0
    return-void

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->i:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->e:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->a(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$a;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;

    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;->a(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->h:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->h:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    if-nez v0, :cond_3

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->h:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->i:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    if-eqz v0, :cond_2

    const-string v0, "SupportWalletFragment"

    const-string v1, "updateMaskedWalletRequest() was called before initialize()"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->j:Lcom/google/android/gms/wallet/MaskedWallet;

    if-eqz v0, :cond_0

    const-string v0, "SupportWalletFragment"

    const-string v1, "updateMaskedWallet() was called before initialize()"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_3
    const-string v0, "SupportWalletFragment"

    const-string v1, "initialize(WalletFragmentInitParams) was called more than once. Ignoring."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;

    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;->a(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->k:Ljava/lang/Boolean;

    :goto_0
    return-void

    :cond_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->k:Ljava/lang/Boolean;

    goto :goto_0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;

    invoke-static {v0, p1, p2, p3}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;->a(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$c;IILandroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    if-eqz p1, :cond_6

    const-class v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v0, "walletFragmentInitParams"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->h:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    if-eqz v1, :cond_0

    const-string v1, "SupportWalletFragment"

    const-string v2, "initialize(WalletFragmentInitParams) was called more than once.Ignoring."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->h:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->i:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    if-nez v0, :cond_2

    const-string v0, "maskedWalletRequest"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->i:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->j:Lcom/google/android/gms/wallet/MaskedWallet;

    if-nez v0, :cond_3

    const-string v0, "maskedWallet"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wallet/MaskedWallet;

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->j:Lcom/google/android/gms/wallet/MaskedWallet;

    :cond_3
    const-string v0, "walletFragmentOptions"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "walletFragmentOptions"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->g:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    :cond_4
    const-string v0, "enabled"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "enabled"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->k:Ljava/lang/Boolean;

    :cond_5
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->b:Z

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->d:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;->a(Landroid/os/Bundle;)V

    return-void

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->f:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->f:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "extraWalletFragmentOptions"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->f:Landroid/support/v4/app/Fragment;

    invoke-virtual {v1}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->a(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->g:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    goto :goto_0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->d:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->b:Z

    return-void
.end method

.method public onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->g:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->g:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "attrKeyWalletFragmentOptions"

    iget-object v2, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->g:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->d:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;

    invoke-virtual {v1, p1, v0, p3}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;->a(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/Bundle;)V

    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->d:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;

    invoke-virtual {v0}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;->d()V

    return-void
.end method

.method public onResume()V
    .locals 3

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->d:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;

    invoke-virtual {v0}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;->c()V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->f:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "GooglePlayServicesErrorDialog"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->f:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/e;->a(Landroid/content/Context;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->f:Landroid/support/v4/app/Fragment;

    invoke-virtual {v1}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/4 v2, -0x1

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/common/e;->b(ILandroid/app/Activity;I)Z

    :cond_0
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    const/4 v2, 0x0

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-class v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->d:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;->b(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->h:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    if-eqz v0, :cond_0

    const-string v0, "walletFragmentInitParams"

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->h:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iput-object v2, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->h:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->i:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    if-eqz v0, :cond_1

    const-string v0, "maskedWalletRequest"

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->i:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iput-object v2, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->i:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->j:Lcom/google/android/gms/wallet/MaskedWallet;

    if-eqz v0, :cond_2

    const-string v0, "maskedWallet"

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->j:Lcom/google/android/gms/wallet/MaskedWallet;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iput-object v2, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->j:Lcom/google/android/gms/wallet/MaskedWallet;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->g:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    if-eqz v0, :cond_3

    const-string v0, "walletFragmentOptions"

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->g:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iput-object v2, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->g:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->k:Ljava/lang/Boolean;

    if-eqz v0, :cond_4

    const-string v0, "enabled"

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->k:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iput-object v2, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->k:Ljava/lang/Boolean;

    :cond_4
    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->d:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;

    invoke-virtual {v0}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;->b()V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;->d:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;

    invoke-virtual {v0}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$d;->e()V

    return-void
.end method
