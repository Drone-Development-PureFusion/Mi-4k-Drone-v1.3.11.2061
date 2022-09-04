.class public final Lcom/google/android/gms/wallet/MaskedWalletRequest$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/MaskedWalletRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/wallet/MaskedWalletRequest;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wallet/MaskedWalletRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wallet/MaskedWalletRequest;Lcom/google/android/gms/wallet/MaskedWalletRequest$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;-><init>(Lcom/google/android/gms/wallet/MaskedWalletRequest;)V

    return-void
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/wallet/MaskedWalletRequest$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->p:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->p:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->p:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a(Lcom/google/android/gms/identity/intents/model/CountrySpecification;)Lcom/google/android/gms/wallet/MaskedWalletRequest$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->n:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->n:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a(Lcom/google/android/gms/wallet/Cart;)Lcom/google/android/gms/wallet/MaskedWalletRequest$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->h:Lcom/google/android/gms/wallet/Cart;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;)Lcom/google/android/gms/wallet/MaskedWalletRequest$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->o:Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWalletRequest$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->a:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/util/Collection;)Lcom/google/android/gms/wallet/MaskedWalletRequest$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/identity/intents/model/CountrySpecification;",
            ">;)",
            "Lcom/google/android/gms/wallet/MaskedWalletRequest$a;"
        }
    .end annotation

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->n:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->n:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_1
    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->b:Z

    return-object p0
.end method

.method public a()Lcom/google/android/gms/wallet/MaskedWalletRequest;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWalletRequest$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->e:Ljava/lang/String;

    return-object p0
.end method

.method public b(Ljava/util/Collection;)Lcom/google/android/gms/wallet/MaskedWalletRequest$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/google/android/gms/wallet/MaskedWalletRequest$a;"
        }
    .end annotation

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->p:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->p:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_1
    return-object p0
.end method

.method public b(Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->c:Z

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWalletRequest$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->f:Ljava/lang/String;

    return-object p0
.end method

.method public c(Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$a;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->d:Z

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWalletRequest$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->g:Ljava/lang/String;

    return-object p0
.end method

.method public d(Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$a;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->j:Z

    return-object p0
.end method

.method public e(Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->l:Z

    return-object p0
.end method

.method public f(Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$a;->a:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->m:Z

    return-object p0
.end method
