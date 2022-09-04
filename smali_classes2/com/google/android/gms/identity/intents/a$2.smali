.class final Lcom/google/android/gms/identity/intents/a$2;
.super Lcom/google/android/gms/identity/intents/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/identity/intents/a;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/identity/intents/UserAddressRequest;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/identity/intents/UserAddressRequest;

.field final synthetic b:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/identity/intents/UserAddressRequest;I)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/identity/intents/a$2;->a:Lcom/google/android/gms/identity/intents/UserAddressRequest;

    iput p3, p0, Lcom/google/android/gms/identity/intents/a$2;->b:I

    invoke-direct {p0, p1}, Lcom/google/android/gms/identity/intents/a$b;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/amn;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/identity/intents/a$2;->a(Lcom/google/android/gms/internal/amn;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/amn;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/identity/intents/a$2;->a:Lcom/google/android/gms/identity/intents/UserAddressRequest;

    iget v1, p0, Lcom/google/android/gms/identity/intents/a$2;->b:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/amn;->a(Lcom/google/android/gms/identity/intents/UserAddressRequest;I)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/identity/intents/a$2;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
