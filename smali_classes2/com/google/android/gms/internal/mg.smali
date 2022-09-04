.class public Lcom/google/android/gms/internal/mg;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/mc;


# instance fields
.field private final a:Lcom/google/android/gms/internal/mc;

.field private b:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mc;J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/mg;->b:J

    iput-object p1, p0, Lcom/google/android/gms/internal/mg;->a:Lcom/google/android/gms/internal/mc;

    iput-wide p2, p0, Lcom/google/android/gms/internal/mg;->b:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/mg;->a:Lcom/google/android/gms/internal/mc;

    invoke-interface {v0}, Lcom/google/android/gms/internal/mc;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/mg;->b:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public a(J)V
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/internal/mg;->b:J

    return-void
.end method
