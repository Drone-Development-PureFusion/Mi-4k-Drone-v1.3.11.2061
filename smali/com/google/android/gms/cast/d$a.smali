.class public final Lcom/google/android/gms/cast/d$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/a$a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/d$a$a;
    }
.end annotation


# instance fields
.field final a:Lcom/google/android/gms/cast/CastDevice;

.field final b:Lcom/google/android/gms/cast/d$b;

.field final c:I


# direct methods
.method private constructor <init>(Lcom/google/android/gms/cast/d$a$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/google/android/gms/cast/d$a$a;->a:Lcom/google/android/gms/cast/CastDevice;

    iput-object v0, p0, Lcom/google/android/gms/cast/d$a;->a:Lcom/google/android/gms/cast/CastDevice;

    iget-object v0, p1, Lcom/google/android/gms/cast/d$a$a;->b:Lcom/google/android/gms/cast/d$b;

    iput-object v0, p0, Lcom/google/android/gms/cast/d$a;->b:Lcom/google/android/gms/cast/d$b;

    iget v0, p1, Lcom/google/android/gms/cast/d$a$a;->c:I

    iput v0, p0, Lcom/google/android/gms/cast/d$a;->c:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/cast/d$a$a;Lcom/google/android/gms/cast/d$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/d$a;-><init>(Lcom/google/android/gms/cast/d$a$a;)V

    return-void
.end method
