.class Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;
.super Lcom/google/android/gms/internal/eu$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$a;

.field private final b:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/eu$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->b:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;

    return-void
.end method


# virtual methods
.method public a(IILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$a;

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->b:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;

    invoke-interface {v0, v1, p1, p2, p3}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$a;->a(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment;IILandroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->a:Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$a;

    return-void
.end method
