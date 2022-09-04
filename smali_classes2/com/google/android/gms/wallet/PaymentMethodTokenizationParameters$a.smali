.class public final Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$a;->a:Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$a;-><init>(Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;)V

    return-void
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$a;->a:Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;

    iput p1, v0, Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;->a:I

    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$a;
    .locals 1

    const-string v0, "Tokenization parameter name must not be empty"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    const-string v0, "Tokenization parameter value must not be empty"

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$a;->a:Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;

    iget-object v0, v0, Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;->b:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public a()Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$a;->a:Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;

    return-object v0
.end method
