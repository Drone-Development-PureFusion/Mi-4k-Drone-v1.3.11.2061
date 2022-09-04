.class Lcom/google/android/gms/nearby/messages/internal/s$f;
.super Lcom/google/android/gms/nearby/messages/internal/n$a;

# interfaces
.implements Lcom/google/android/gms/nearby/messages/internal/s$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/nearby/messages/internal/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/nearby/messages/internal/n$a;",
        "Lcom/google/android/gms/nearby/messages/internal/s$a",
        "<",
        "Lcom/google/android/gms/nearby/messages/l;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/messages/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ail;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/messages/l;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/nearby/messages/internal/n$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/s$f;->a:Lcom/google/android/gms/internal/ail;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/nearby/messages/internal/s$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/s$f;-><init>(Lcom/google/android/gms/internal/ail;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/ail;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/messages/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s$f;->a:Lcom/google/android/gms/internal/ail;

    return-object v0
.end method

.method public a(Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s$f;->a:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/s$f$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/nearby/messages/internal/s$f$1;-><init>(Lcom/google/android/gms/nearby/messages/internal/s$f;Z)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    return-void
.end method
