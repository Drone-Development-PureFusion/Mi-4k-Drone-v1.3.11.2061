.class Lcom/google/android/gms/internal/afn$a;
.super Lcom/google/android/gms/internal/afp$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/afn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/afn;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/afn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/afn$a;->a:Lcom/google/android/gms/internal/afn;

    invoke-direct {p0}, Lcom/google/android/gms/internal/afp$a;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/afn;Lcom/google/android/gms/internal/afn$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/afn$a;-><init>(Lcom/google/android/gms/internal/afn;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const v0, 0x93c108

    return v0
.end method

.method public a(JJ)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/afn$a;->a:Lcom/google/android/gms/internal/afn;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Long;

    const/4 v2, 0x0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/afn;->a(Lcom/google/android/gms/internal/afn;[Ljava/lang/Object;)V

    return-void
.end method
