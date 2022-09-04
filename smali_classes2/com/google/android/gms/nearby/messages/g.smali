.class public Lcom/google/android/gms/nearby/messages/g;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/a$a$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/nearby/messages/g$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final b:Z

.field public final c:I

.field public final d:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/nearby/messages/g$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/g$a;->a(Lcom/google/android/gms/nearby/messages/g$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/g;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/g$a;->b(Lcom/google/android/gms/nearby/messages/g$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/nearby/messages/g;->b:Z

    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/g$a;->c(Lcom/google/android/gms/nearby/messages/g$a;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/nearby/messages/g;->c:I

    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/g$a;->d(Lcom/google/android/gms/nearby/messages/g$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/g;->d:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/nearby/messages/g$a;Lcom/google/android/gms/nearby/messages/g$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/nearby/messages/g;-><init>(Lcom/google/android/gms/nearby/messages/g$a;)V

    return-void
.end method
