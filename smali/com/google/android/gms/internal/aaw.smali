.class public Lcom/google/android/gms/internal/aaw;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/aaw$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:J


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/aaw$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/aaw$a;->a(Lcom/google/android/gms/internal/aaw$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/aaw;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/aaw$a;->b(Lcom/google/android/gms/internal/aaw$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/aaw;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/aaw$a;->c(Lcom/google/android/gms/internal/aaw$a;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/aaw;->c:I

    invoke-static {p1}, Lcom/google/android/gms/internal/aaw$a;->d(Lcom/google/android/gms/internal/aaw$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/aaw;->d:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/aaw$a;Lcom/google/android/gms/internal/aaw$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/aaw;-><init>(Lcom/google/android/gms/internal/aaw$a;)V

    return-void
.end method
