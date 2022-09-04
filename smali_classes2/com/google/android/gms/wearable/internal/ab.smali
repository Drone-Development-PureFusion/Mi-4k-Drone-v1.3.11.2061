.class final Lcom/google/android/gms/wearable/internal/ab;
.super Lcom/google/android/gms/wearable/internal/ba;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wearable/internal/ab$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/wearable/internal/ba",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private b:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<TT;>;"
        }
    .end annotation
.end field

.field private c:Lcom/google/android/gms/wearable/internal/ab$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/wearable/internal/ab$a",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/common/api/g;Ljava/lang/Object;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/wearable/internal/ab$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "TT;",
            "Lcom/google/android/gms/internal/ail",
            "<TT;>;",
            "Lcom/google/android/gms/wearable/internal/ab$a",
            "<TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/ba;-><init>(Lcom/google/android/gms/common/api/g;)V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/ab;->a:Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ail;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/ab;->b:Lcom/google/android/gms/internal/ail;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/ab$a;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/ab;->c:Lcom/google/android/gms/wearable/internal/ab$a;

    return-void
.end method

.method static a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/internal/ab$a;Ljava/lang/Object;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/wearable/internal/ab$a",
            "<TT;>;TT;)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/google/android/gms/common/api/g;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/wearable/internal/ab;

    invoke-direct {v1, p0, p2, v0, p1}, Lcom/google/android/gms/wearable/internal/ab;-><init>(Lcom/google/android/gms/common/api/g;Ljava/lang/Object;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/wearable/internal/ab$a;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/ab;->a:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/ab;->b:Lcom/google/android/gms/internal/ail;

    return-object p1
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/internal/ar;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/ab;->a(Lcom/google/android/gms/wearable/internal/ar;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/wearable/internal/ar;)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ab;->c:Lcom/google/android/gms/wearable/internal/ab$a;

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/ab;->a:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/wearable/internal/ab;->b:Lcom/google/android/gms/internal/ail;

    invoke-interface {v0, p1, p0, v1, v2}, Lcom/google/android/gms/wearable/internal/ab$a;->a(Lcom/google/android/gms/wearable/internal/ar;Lcom/google/android/gms/internal/ahl$b;Ljava/lang/Object;Lcom/google/android/gms/internal/ail;)V

    iput-object v3, p0, Lcom/google/android/gms/wearable/internal/ab;->a:Ljava/lang/Object;

    iput-object v3, p0, Lcom/google/android/gms/wearable/internal/ab;->b:Lcom/google/android/gms/internal/ail;

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/ab;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method
