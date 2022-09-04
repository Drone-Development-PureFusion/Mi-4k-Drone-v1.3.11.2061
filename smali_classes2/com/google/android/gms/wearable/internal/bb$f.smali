.class final Lcom/google/android/gms/wearable/internal/bb$f;
.super Lcom/google/android/gms/wearable/internal/ba;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/internal/bb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/ba",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/wearable/a$c;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/a$c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/ba;-><init>(Lcom/google/android/gms/common/api/g;)V

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/bb$f;->a:Lcom/google/android/gms/wearable/a$c;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/a$c;Lcom/google/android/gms/wearable/internal/bb$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/bb$f;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/a$c;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/bb$f;->a:Lcom/google/android/gms/wearable/a$c;

    return-object p1
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/internal/ar;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/bb$f;->a(Lcom/google/android/gms/wearable/internal/ar;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/wearable/internal/ar;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bb$f;->a:Lcom/google/android/gms/wearable/a$c;

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/wearable/internal/ar;->a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/a$c;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/bb$f;->a:Lcom/google/android/gms/wearable/a$c;

    return-void
.end method

.method public synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/bb$f;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method
