.class public final Lcom/google/android/gms/wallet/d$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/a$a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/d$a$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field final c:Z
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/d$a$a;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/d$a$a;-><init>()V

    invoke-direct {p0, v0}, Lcom/google/android/gms/wallet/d$a;-><init>(Lcom/google/android/gms/wallet/d$a$a;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wallet/d$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/wallet/d$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/wallet/d$a$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/wallet/d$a$a;->a(Lcom/google/android/gms/wallet/d$a$a;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/wallet/d$a;->a:I

    invoke-static {p1}, Lcom/google/android/gms/wallet/d$a$a;->b(Lcom/google/android/gms/wallet/d$a$a;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/wallet/d$a;->b:I

    invoke-static {p1}, Lcom/google/android/gms/wallet/d$a$a;->c(Lcom/google/android/gms/wallet/d$a$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/wallet/d$a;->c:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wallet/d$a$a;Lcom/google/android/gms/wallet/d$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/d$a;-><init>(Lcom/google/android/gms/wallet/d$a$a;)V

    return-void
.end method
