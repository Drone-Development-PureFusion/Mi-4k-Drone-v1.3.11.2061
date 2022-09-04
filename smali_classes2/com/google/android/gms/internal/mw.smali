.class public Lcom/google/android/gms/internal/mw;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/b/e;


# instance fields
.field private a:J

.field private b:I

.field private c:Lcom/google/firebase/b/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/mw;->a:J

    return-wide v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/mw;->b:I

    return-void
.end method

.method public a(J)V
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/internal/mw;->a:J

    return-void
.end method

.method public a(Lcom/google/firebase/b/f;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mw;->c:Lcom/google/firebase/b/f;

    return-void
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mw;->b:I

    return v0
.end method

.method public c()Lcom/google/firebase/b/f;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mw;->c:Lcom/google/firebase/b/f;

    return-object v0
.end method
