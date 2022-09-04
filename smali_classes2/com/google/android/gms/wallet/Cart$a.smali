.class public final Lcom/google/android/gms/wallet/Cart$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/Cart;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/wallet/Cart;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wallet/Cart;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/Cart$a;->a:Lcom/google/android/gms/wallet/Cart;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wallet/Cart;Lcom/google/android/gms/wallet/Cart$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/Cart$a;-><init>(Lcom/google/android/gms/wallet/Cart;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/wallet/LineItem;)Lcom/google/android/gms/wallet/Cart$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/Cart$a;->a:Lcom/google/android/gms/wallet/Cart;

    iget-object v0, v0, Lcom/google/android/gms/wallet/Cart;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/wallet/Cart$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/Cart$a;->a:Lcom/google/android/gms/wallet/Cart;

    iput-object p1, v0, Lcom/google/android/gms/wallet/Cart;->a:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/util/List;)Lcom/google/android/gms/wallet/Cart$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wallet/LineItem;",
            ">;)",
            "Lcom/google/android/gms/wallet/Cart$a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/Cart$a;->a:Lcom/google/android/gms/wallet/Cart;

    iget-object v0, v0, Lcom/google/android/gms/wallet/Cart;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/wallet/Cart$a;->a:Lcom/google/android/gms/wallet/Cart;

    iget-object v0, v0, Lcom/google/android/gms/wallet/Cart;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public a()Lcom/google/android/gms/wallet/Cart;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/Cart$a;->a:Lcom/google/android/gms/wallet/Cart;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/wallet/Cart$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/Cart$a;->a:Lcom/google/android/gms/wallet/Cart;

    iput-object p1, v0, Lcom/google/android/gms/wallet/Cart;->b:Ljava/lang/String;

    return-object p0
.end method
